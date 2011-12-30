package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Comment;
import model.Protocol;
import model.Publication;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-30T09:48:39")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile ListAttribute<Users, Publication> publicationList;
    public static volatile SingularAttribute<Users, String> roleuser;
    public static volatile ListAttribute<Users, Protocol> protocolList;
    public static volatile ListAttribute<Users, Comment> commentList;

}