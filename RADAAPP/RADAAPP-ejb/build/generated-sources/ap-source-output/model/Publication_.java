package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Comment;
import model.Users;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-30T09:48:39")
@StaticMetamodel(Publication.class)
public class Publication_ { 

    public static volatile SingularAttribute<Publication, String> subtext;
    public static volatile SingularAttribute<Publication, String> text;
    public static volatile SingularAttribute<Publication, String> title;
    public static volatile SingularAttribute<Publication, Date> date_publ;
    public static volatile SingularAttribute<Publication, String> type;
    public static volatile ListAttribute<Publication, Comment> commentList;
    public static volatile SingularAttribute<Publication, Users> avtor;

}