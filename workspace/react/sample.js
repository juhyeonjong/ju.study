
function Sample(){
    return React.createElement("b", null, "처음 만들어 보는 컴포넌트");
}

const ss = document.querySelector("#sample");
ReactDOM.render(React.createElement(Sample), ss);