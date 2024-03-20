import React,{useRef,useState} from "react";

function RefCompoEx(props){

  const nameEle = useRef(null);
  const addrEle = useRef(null);

  const [name,setName] = useState("");
  const [addr,setAddr] = useState("");

  function copyFn(){
    const nameVal = nameEle.current.value;
    const addrVal = addrEle.current.value;
    setName(nameVal);
    setAddr(addrVal);
  }
  return (
    <div>
      이름 : <input type="text" ref={nameEle}/><br></br>
      주소 : <input type="text" ref={addrEle}/><br></br>
      <button onClick={copyFn}>저장</button>
      <div>
        입력한 이름 : {name}/
        입력한 주소 : {addr}
      </div>
    </div>
  );

}

export default RefCompoEx;