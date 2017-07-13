var express = require('express');
var router = express.Router();
var mongo = require('mongodb');
var monk = require('monk');
var db = monk('localhost:27017/mydb');

// o local onde esta o meu usuario.js
var usuario = require('../models/usuario.js');

var jwt = require('jsonwebtoken');
var super_secret = 'festaEhMassa'; 

// gera o token  exemplo no meu banco que ja tem esse usuario
/* mas pode ser var token = jwt.sign(user,super_secret,{
    expiresIn: 3000

});

*/
var token = jwt.sign({email: 'bernard@gmail.com'}, 'super_secret');


// aparece no prompt o token gerado
console.log(token);


// meu banco de dados
mongoose.connect('mongodb://localhost:27017/bancoES',function(err,db){
    if(err) {
        console.log("erro: " + err);
    } else {
        console.log("Conectou no db");
    }
});


// oque esta no meu desktop
router.post('/authenticate', function(req, res) {

  // encontra o usuario
  User.findOne({
    name: req.body.name
  }, function(err, user) {

    if (err){
        throw err;
    } 

    if (!user) {
      res.json({ success: false, message: 'erro na autenticação, usuario nao encontrado' });
    } else if (user) {

      // ele verifica o password
      if (user.password != req.body.password) {
        res.json({ success: false, message: 'erro na autenticação, password incorreta' });
      } else {

        // se ele encontra o usario e esta certo o password o token é criado
        
        var token = jwt.sign(user, app.get('superSecret'), {
          expiresInMinutes: 1440 
        });

        // retorna a informação com o json
        res.json({
          success: true,
          message: 'parabens garato!',
          token: token
        });
      }   

    }

  });


// proteção de rota midleware
module.exports.validar = function(req, res, next) {
    var token = (req.body && req.body.access_token) || (req.query && req.query.access_token) || req.headers['x-access-token'];

    if (token) {

    // verifica o superSecret 
    jwt.verify(token, app.get('superSecret'), function(err, decoded) {      
      if (err) {
        return res.json({ success: false, message: 'Falha ao autenticar o token.' });    
      } else {
        
        req.decoded = decoded;    
        next();
      }
    });

  } else {

    // se nao tem token validado retorna erro
   
    return res.status(403).send({ 
        success: false, 
        message: 'No token provided.' 
    });

  }


};

module.exports = router;
