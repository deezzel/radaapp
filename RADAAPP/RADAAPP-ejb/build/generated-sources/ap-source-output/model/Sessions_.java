package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Laws;
import model.Protocol;
import model.Users;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-30T09:48:39")
@StaticMetamodel(Sessions.class)
public class Sessions_ { 

    public static volatile ListAttribute<Sessions, Protocol> protocolList;
    public static volatile ListAttribute<Sessions, Laws> lawsList;
    public static volatile SingularAttribute<Sessions, Integer> countparticipants;
    public static volatile SingularAttribute<Sessions, String> headsession;
    public static volatile SingularAttribute<Sessions, String> type;
    public static volatile SingularAttribute<Sessions, Date> timeleadthrou;
    public static volatile SingularAttribute<Sessions, Users> secretary;

}