package lesson9.utils.hw;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        if(users == null || users.length == 0)
            return null;

//        int count = 0;
//        for(User elem : users) {
//        	if(elem != null) {
//        		count++;
//        	}
//        }
        //String[] userNames = new User[count];
        String[] userNames = new String[users.length];

        for(int i = 0; i < users.length; i++) {
            if(users[i] != null) {
                userNames[i] = users[i].getName();
            }
        }
        return userNames;
    }

    public long[] getUserIds() {
        if(users == null || users.length == 0)
            return null;

        int count = 0;
        for(User elem : users) {
        	if(elem != null) {
        		count++;
        	}
        }
        long[] userId = new long[count];
        int j = 0;
        for(int i = 0; i < users.length; i++) {
            if(users[i] != null) {
                userId[i] = users[i].getId();
                j++;
            } else
                j--;
        }
        return userId;
    }

    public String getUserNameById(long id) {
        int index = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id)
                index = i;
        }
        if (index >= 0)
            return users[index].getName();
        else
            return null;
    }

    public User getUserByName(String name) {
        int index = -1;
		for(int i = 0; i < users.length; i++) {
			if(users[i] != null){
				if(users[i].getName() == name) {
					index = i;
				}
			}
		}
		if(index >= 0)
			return users[index];
		else
			return null;
    }

    public User getUserById(long id) {
        int index = -1;
        for(int i = 0; i < users.length; i++) {
            if(users[i] != null){
                if(users[i].getId() == id) {
                    index = i;
                }
            }
        }
        if(index >= 0)
            return users[index];
        else
            return null;
    }

    public User getUserBySessionId(String sessionId) {
        int index = -1;
        for(int i = 0; i < users.length; i++) {
            if(users[i] != null){
                if(users[i].getSessionId() == sessionId) {
                    index = i;
                }
            }
        }
        if(index >= 0)
            return users[index];
        else
            return null;
    }

    public User save(User user) {
        if(user == null)
            return null;
        int index= -1;
        if (findById(user.getId()) != null)
            return null;
        else {
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = user;
                    index = i;
                    break;
                }
            }
            if (index >=0)
                return users[index];
            else
                return null;
        }
    }

    private User findById(long id) {
        int index = -1;
        for(int i = 0; i < users.length; i++) {
            if(users[i] != null){
                if(users[i].getId() == id) {
                    index = i;
                }
            }
        }
        if(index >= 0)
            return users[index];
        else
            return null;
    }
}
