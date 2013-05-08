var express = require('express');
var app = express();
var fs = require('fs');

app.get('/rest/kml', function(req, res){
	var lat = req.query.lat;
	var lng = req.query.lng;
	var kml = fs.readFileSync('./kml/template.kml','utf8');
	
	res.set({
		  'Content-Type': 'application/vnd.google-earth.kml+xml',
		  'Content-Disposition': 'attachment; filename=CA_Hazard_Layers.kml'
	});
	res.send(kml.replace(/{{lat}}/g,lat).replace(/{{lon}}/g,lng));
	
});

app.listen(4000);