var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var usuarioSchema = new Schema({
	name: {
		type:String,
		required:true
	},
	email: {
		type:String,
		required:true
	},
	password: {
		type:String,
		required:true 
		
	}
	
	
});

var usuario = mongoose.model('usuario', usuarioSchema);

module.exports = usuario;