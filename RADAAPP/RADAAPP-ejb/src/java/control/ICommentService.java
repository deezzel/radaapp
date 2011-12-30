package control;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package control.iservices;
import model.Comment;
import java.util.List;
import model.Publication;
import model.Users;

/**
 *
 * @author Julia
 */
public interface ICommentService {
    
   
   public List<Comment> getByPublication (Publication pub);;
   
   public boolean add_Comment (Comment com, Publication pub, Users usr);
 
    public boolean remove_Comment (Comment com, Publication pub, Users usr);
}
