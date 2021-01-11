import * as keycloak_import from "keycloak.js";

const http = require('http');

const hostname = '127.0.0.1';
const port = 1011;

function initKeycloak() {
    var keycloak = new Keycloak();
    keycloak.init().then(function(authenticated) {
        alert(authenticated ? 'authenticated' : 'not authenticated');
    }).catch(function() {
        alert('failed to initialize');
    });
}



const server = http.createServer((req, res) => {

    initKeycloak();
    res.statusCode = 200;
    res.setHeader('Content-Type', 'html');
    res.end('<a>Test Keycloak</a>');

});

server.listen(port, hostname, () => {
  console.log(`Serveur lancé sur http://${hostname}:${port}/`);
});
