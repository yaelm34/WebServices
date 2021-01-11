const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'html');
  res.end('<a href="https://accounts.google.com/o/oauth2/v2/auth?access_type=offline&scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fcontacts.readonly&response_type=code&client_id=304496277291-ssc3nca2qar7r37ko37jf7h26ogtl1lc.apps.googleusercontent.com&redirect_uri=http%3A%2F%2Flocalhost%3A1010%2FrerirectGoogle">Connexion</a>');
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});
