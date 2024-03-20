
const boardList = [{
  bno : 1,
  btitle : '첫번째 게시글 제목',
  bwriter: '홍길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'첫번째 게시글 내용'
},{
  bno : 2,
  btitle : '두번째 게시글 제목',
  bwriter: '고길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'두번째 게시글 내용'
},{
  bno : 3,
  btitle : '세번째 게시글 제목',
  bwriter: '이길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'세번째 게시글 내용'
},{
  bno : 4,
  btitle : '네번째 게시글 제목',
  bwriter: '홍길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'네번째 게시글 내용'
},{
  bno : 5,
  btitle : '다섯번째 게시글 제목',
  bwriter: '고길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'다섯번째 게시글 내용'
}]

function ListCompoEx1(props){

  return(
    <table border={1}>
      <thead>
        <tr>
          <th>글번호</th>
          <th>글제목</th>
          <th>작성자</th>
          <th>작성일</th>
        </tr>
      </thead>
      <tbody>
      {
        boardList.map((board)=>{
          return (
            <tr key={board.bno}>
              <td>{board.bno}</td>
              <td>{board.btitle}</td>
              <td>{board.bwriter}</td>
              <td>{board.brdate}</td>
            </tr>
          );
        })
      }
      </tbody>
    </table>
  );
}

export default ListCompoEx1;