package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Publication;
import model.Users;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-30T09:48:39")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, String> text;
    public static volatile SingularAttribute<Comment, Date> datecomm;
    public static volatile SingularAttribute<Comment, Users> avtor;
    public static volatile SingularAttribute<Comment, Publication> publication;

}