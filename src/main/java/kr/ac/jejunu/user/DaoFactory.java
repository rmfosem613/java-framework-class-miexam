package kr.ac.jejunu.user;

public class DaoFactory {
    public UserDao getUserDao() {
        return new UserDao(getConnectionMaker());
    }

    private ConnectionMaker getConnectionMaker() {
        return new JejuConnectionMaker();
    }
}
