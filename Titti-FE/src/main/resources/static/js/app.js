/**
 * 
 */
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
  }
});