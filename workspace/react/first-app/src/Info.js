import Library from "./Library";

function Info(props){

  return (
    <div>
      <h2>그동안의 컴포넌트 출력하기</h2>
      {props.title}
      {props.num1+props.num2}
      {props.library}
      {props.box}
      {props.button}
    </div>
  );
}

export default Info;