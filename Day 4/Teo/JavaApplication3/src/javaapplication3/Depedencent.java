class AuthService {
    private final UserRepositoryService repository = new UserRepositoryService();
    
    public AuthResponse auth(AuthenticationRequest request) {
      User = repository.findByUsername(request.getUsername());
      
      // Ini cuma contoh jangan buat autentikasi begini ya
      if (user.getPassword().equals(request.getPassword)) {
        return new AuthResponse(true);
      } else {
        return new AuthResponse(false, "Username atau password yang dimasukan salah");
      }
    }
  }
  
  class UserDetailService {
    private final UserRepositoryService repository = new UserRepositoryService();
    
    public UserDetail getDetail(UserDetailRequest request) {
      User user = repository.findByUsername(request.getUsername());
      return new UserDetail(user);
    }
  }
  
  class UserRepositoryService {
    public User findByUsername(String username) {
      // Berisi kodingan untuk query ke database
    }
  }