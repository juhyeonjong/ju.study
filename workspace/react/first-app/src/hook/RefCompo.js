import React,{useRef, useState} from "react";

function RefCompo(props){
  const [data,setData] = useState('');
  const text = useRef(null);

  function copyfn(){
    const value = text.current.value;
    setData(value);
  }
  return (
    <div>
      <input type="text" ref={text} />
      <button onClick={copyfn}>copry</button><br/>
      <div>
        {data}
      </div>
    </div>
  );

}

export default RefCompo;