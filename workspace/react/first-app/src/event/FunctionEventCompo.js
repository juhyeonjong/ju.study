function FunctionEventCompo(props){

  function clickfn(num1,num2){
    console.log(num1+num2);
  }
  return (
    <div>
    <button onClick={clickfn}>click</button>
    <button onClick={(event)=>{clickfn(1,2,event);}}>click</button>
    </div>
  );
}