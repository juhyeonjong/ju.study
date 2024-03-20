
const styles={
  wrapper:{
    margin: 8,
    padding: 8,
    display: "flex",
    flexDirection:"row",
    border:"1px solid gray",
    borderRadius:16
  },
  imageContainer:{},
  image:{
    width:50,
    height:50,
    borderRadius: 25
  },
  contentContainer:{
    marginLeft:8,
    display:"flex",
    flexDirection:"column",
    jusfityContent:"center"
  },
  nameText:{
    color:"black",
    fontSize : 16,
    fontWeight:"bold"
  },
  commentText:{
    color:"black",
    fontSize:16
  }
}

const src ='https://upload.wikimedia.org/wikipedia/commons/8/89/Portrait_Placeholder.png';


function Comment(props){
  return(
   <div style={styles.wrapper}>
    <div style={styles.imageContainer}>
      <img src={src} style={styles.image} alt=""/>
    </div>
    <div style={styles.contentContainer}>
      <span style={styles.nameText}>{props.name}</span>
      <span style={styles.commentText}>{props.comment}</span>
    </div>
   </div>
  );
}

export default Comment;