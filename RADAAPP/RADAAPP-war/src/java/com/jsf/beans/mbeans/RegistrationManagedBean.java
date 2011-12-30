/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans.mbeans;

import com.jsf.util.JsfUtil;
import control.servicimplem.UserService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Users;
import java.util.Hashtable;
import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.directory.ModificationItem;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.DirContext;
import javax.naming.directory.Attributes;
import javax.naming.directory.Attribute;
import javax.naming.NamingException;

/**
 *
 * @author Julia
 */
@ManagedBean(name = "regManBean")
@SessionScoped
public class RegistrationManagedBean implements  DirContext {

    @EJB
    private UserService userService;
    //private Users current;
    private String login;
    private String password;
    private String name;
    private String secname;
    private String patronymic;
    private String email;
    private String phone;
    private String repasswd;
    private String role;
    public static String ldapUri = "ldap://localhost:1389/dc=rada,dc=com";
    public static String admindn = "cn=Directory Manager";
    public static String admincred = "qwerty";
    public static String usersContainer = "dc=rada,dc=com";

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
//    public static String passwd = "123456";
//    public String mess;

    public String getRepasswd() {
        return repasswd;
    }

    public void setRepasswd(String repasswd) {
        this.repasswd = repasswd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecname() {
        return secname;
    }

    public void setSecname(String secname) {
        this.secname = secname;
    }

    /** Creates a new instance of RegistrationManagedBean */
    public RegistrationManagedBean() {
    }
    
    

    public void clear() {
        login = null;
        name = null;
        email= null;
        password = null;
        secname = null;
        repasswd = null;
        patronymic = null;
        phone = null;
        role="1";
    }
    
    public boolean isRegist () {
        if (name!=null && secname!=null && email!=null && login!=null && password!=null && repasswd!=null){
            return false;
        }
        return true;
    }

    public void registaration() {
        String username = this.login;
        String pword = this.password;
        
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, ldapUri);
        env.put( Context.SECURITY_PRINCIPAL, admindn );
        env.put( Context.SECURITY_CREDENTIALS, admincred );
         try {
            DirContext ctx = new InitialDirContext(env);

        Attributes attrs = new BasicAttributes(true);
       
        attrs.put(new BasicAttribute("uid",username));
        attrs.put(new BasicAttribute("cn",username));
        attrs.put(new BasicAttribute("givenname",username));
        attrs.put(new BasicAttribute("sn",username));
        attrs.put(new BasicAttribute("userPassword",pword));
        attrs.put(new BasicAttribute("objectclass","top"));
        attrs.put(new BasicAttribute("objectclass","person"));
        attrs.put(new BasicAttribute("objectclass","organizationalPerson"));
        attrs.put(new BasicAttribute("objectclass","inetorgperson"));
        String name = "cn="+username;
        ctx.createSubcontext("cn="+username, attrs);
        //ctx.bind(name, attrs);
        
        ctx.close();
         } catch (NamingException e) {
        e.printStackTrace();
        
    }
        if (password.equals(repasswd)) {
            Users us = new Users(login, name, password, secname, role);
            us.setPatronymic(patronymic);
            us.setPhone(phone);
            userService.create(us);
              try {   
                FacesContext.getCurrentInstance().getExternalContext().redirect("/RADAAPP-war/faces/index.xhtml");
               
            } catch (IOException ex) {
               Logger.getLogger(UsersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else {
            JsfUtil.addErrorMessage("Repassword and password don't the same");
        }

        // } catch (EJBException e) {
        //     JsfUtil.addErrorMessage("Put all parameters!");
        // }
    }

    @Override
    public Attributes getAttributes(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Attributes getAttributes(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Attributes getAttributes(Name name, String[] attrIds) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Attributes getAttributes(String name, String[] attrIds) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modifyAttributes(Name name, int mod_op, Attributes attrs) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modifyAttributes(String name, int mod_op, Attributes attrs) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modifyAttributes(Name name, ModificationItem[] mods) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modifyAttributes(String name, ModificationItem[] mods) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bind(Name name, Object obj, Attributes attrs) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bind(String name, Object obj, Attributes attrs) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rebind(Name name, Object obj, Attributes attrs) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rebind(String name, Object obj, Attributes attrs) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DirContext createSubcontext(Name name, Attributes attrs) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DirContext createSubcontext(String name, Attributes attrs) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DirContext getSchema(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DirContext getSchema(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DirContext getSchemaClassDefinition(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DirContext getSchemaClassDefinition(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<SearchResult> search(Name name, Attributes matchingAttributes, String[] attributesToReturn) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<SearchResult> search(String name, Attributes matchingAttributes, String[] attributesToReturn) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<SearchResult> search(Name name, Attributes matchingAttributes) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<SearchResult> search(String name, Attributes matchingAttributes) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<SearchResult> search(Name name, String filter, SearchControls cons) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<SearchResult> search(String name, String filter, SearchControls cons) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<SearchResult> search(Name name, String filterExpr, Object[] filterArgs, SearchControls cons) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<SearchResult> search(String name, String filterExpr, Object[] filterArgs, SearchControls cons) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object lookup(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object lookup(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bind(Name name, Object obj) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bind(String name, Object obj) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rebind(Name name, Object obj) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rebind(String name, Object obj) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void unbind(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void unbind(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rename(Name oldName, Name newName) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rename(String oldName, String newName) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<NameClassPair> list(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<NameClassPair> list(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<Binding> listBindings(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NamingEnumeration<Binding> listBindings(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void destroySubcontext(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void destroySubcontext(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Context createSubcontext(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Context createSubcontext(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object lookupLink(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object lookupLink(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NameParser getNameParser(Name name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NameParser getNameParser(String name) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Name composeName(Name name, Name prefix) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String composeName(String name, String prefix) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object addToEnvironment(String propName, Object propVal) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object removeFromEnvironment(String propName) throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Hashtable<?, ?> getEnvironment() throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void close() throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getNameInNamespace() throws NamingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
