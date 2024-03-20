import React,{useState} from "react";

function TextBox(props){

  const [text,setText] = useState("");

  function copyfn(){
    const value = document.getElementById("text").value;
    setText(value);
  }
  return  (
    <div>
      <input type="text" id="text" />
      <button onClick={copyfn}>copy!!</button>
      <div>
        {text}
      </div>
    </div>
  );

}
export default TextBox;