const axiosConfig = {
	headers: {
		'Access-Control-Allow-Origin': '*',
//			'Access-Control-Allow-Credentials': 'false',
//			'Access-Control-Allow-Headers': 'Server,Connection,X-CorrelationID,Cache-Control,Date,Expires,Pragma,Server,Content-Type',
//			'Access-Control-Allow-Methods': 'GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH',
//			'Access-Control-Expose-Headers': 'Server, Connection, X-CorrelationID, Cache-Control, Date, Expires, Pragma, Server, Content-Type',
		'content-Type': 'application/json',
//			"Accept": "*/*",
//			"Cache-Control": "no-cache",
		'Authorization': 'Basic YWRtaW46QWRtQkBuY28=',
//			'Sec-Fetch-Site':	'cross-site',
//			'Sec-Fetch-Mode':	'cors'
		}
//		credentials: "same-origin"
};

Vue.use(VueMaterial.default);

const vm = new Vue({
  el: '#app',
  data: {
  	main_header: 'Super Special Greeting',
  	main_intro: 'Hello World',
    links: [
      {text: "Hello 1", url: "ctrl-1/hello-1"},
      {text: "Hello 2", url: "ctrl-2/hello-2"},
      {text: "Hello 3", url: "ctrl-3/hello-3"},
      {text: "User me", url: "ctrl-user/me"}
    ]
  },
  
  methods: {
		service_load: function() {
			axios.get('http://claudj.ns0.it/titti/ctrl-3/hello-3', axiosConfig)
				.then(response => (this.services = response.data.result.services))
		}
  }
});