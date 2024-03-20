import Comment from "./Comment";

function CommentList(props){
  return(
    <div>
      <Comment name={"홍길동"} comment={"첫번째 컴포넌트 댓글"}/>
      <Comment name={"이길동"} comment={"두번째 컴포넌트 댓글"}/>
      <Comment name={"거길동"} comment={"세번째 컴포넌트 댓글"}/>
    </div>
  );
}

export default CommentList;