package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Sessions;
import model.Users;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-30T09:48:39")
@StaticMetamodel(Protocol.class)
public class Protocol_ { 

    public static volatile SingularAttribute<Protocol, Users> deputat;
    public static volatile SingularAttribute<Protocol, String> text;
    public static volatile SingularAttribute<Protocol, Date> timeWhenReg;
    public static volatile SingularAttribute<Protocol, Sessions> session;
    public static volatile SingularAttribute<Protocol, Users> avtor;

}