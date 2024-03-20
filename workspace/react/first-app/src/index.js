import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import ListCompoEx1 from './list/ListCompoEx1';
import Menu from './list/Menu';
import ListCompoEx2 from './list/ListCompoEx2';
import FormCompo from './form/FormCompo';
/*
setInterval(()=>{
  ReactDOM.render(
    <React.StrictMode>
      <Clock/>
    </React.StrictMode>
    ,document.getElementById('root'));
},1000); //function(){}
*/
/*
ReactDOM.render(
  <React.StrictMode>
    <ImPureCompo data="클릭하세요."/>
  </React.StrictMode>
  ,document.getElementById('root')
);
*/
/*
ReactDOM.render(
<React.StrictMode>
  <Info title="컴포넌트들 출력!" num1={100} num2={300}
    library = {<Library/>}
    box={<Box/>}
    button={<Button color="green">click</Button>}
  />
  <ClassCompo title="클래스 컴포넌트입니다."/>
</React.StrictMode>
,document.getElementById("root"));
*/
ReactDOM.render(
  <React.StrictMode>
    <FormCompo/>
  </React.StrictMode>
,document.getElementById("root"));

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals(console.log); //app의 퍼포먼스 확인을 위한 함수 reportWebVitals(console.log);
