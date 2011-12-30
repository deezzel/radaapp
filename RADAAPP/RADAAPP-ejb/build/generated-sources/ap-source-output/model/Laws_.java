package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Decision;
import model.Sessions;
import model.Users;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-30T09:48:39")
@StaticMetamodel(Laws.class)
public class Laws_ { 

    public static volatile SingularAttribute<Laws, String> title;
    public static volatile SingularAttribute<Laws, Sessions> session;
    public static volatile SingularAttribute<Laws, String> descript;
    public static volatile SingularAttribute<Laws, Date> timeAccept;
    public static volatile SingularAttribute<Laws, Decision> decision;
    public static volatile SingularAttribute<Laws, Users> avtor;

}