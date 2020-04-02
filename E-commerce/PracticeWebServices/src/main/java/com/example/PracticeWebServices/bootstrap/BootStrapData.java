package com.example.PracticeWebServices.bootstrap;

import com.example.PracticeWebServices.domain.Admin;
import com.example.PracticeWebServices.domain.Customer;
import com.example.PracticeWebServices.domain.StoreOwner;
import com.example.PracticeWebServices.domain.User;
import com.example.PracticeWebServices.repositories.AdminRepository;
import com.example.PracticeWebServices.repositories.CustomerRepository;
import com.example.PracticeWebServices.repositories.StoreOwnerRepository;
import com.example.PracticeWebServices.repositories.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final UserRepo userRepo;
    private  final CustomerRepository customerRepository;
    private final AdminRepository adminRepository;
    private final StoreOwnerRepository storeOwnerRepository;

    public BootStrapData(UserRepo userRepo, CustomerRepository customerRepository, AdminRepository adminRepository, StoreOwnerRepository storeOwnerRepository) {
        this.userRepo = userRepo;
        this.customerRepository = customerRepository;
        this.adminRepository = adminRepository;
        this.storeOwnerRepository = storeOwnerRepository;
    }


    @Override
    public void run(String... args) throws Exception {



        User user =new User();
        user.setEmail("kareemmagdy1");
        user.setUserName("Kareem");
        user.setPassWord("Magdy");
        userRepo.save(user);

        User user2 =new User();
        user2.setEmail("flawless");
        user2.setUserName("Amr");
        user2.setPassWord("Magdy");
        userRepo.save(user2);

        User user3 =new User();
        user3.setEmail("youssef 3okasha");
        user3.setUserName("Youssef");
        user3.setPassWord("Ismail");
        userRepo.save(user3);

        User user4 =new User();
        user4.setEmail("mark@newtech");
        user4.setUserName("Mark");
        user4.setPassWord("Samuel");
        userRepo.save(user4);

        Admin admin=new Admin();
        admin.setUser(user);
        adminRepository.save(admin);

        Customer customer=new Customer();
        customer.setUser(user2);
        customerRepository.save(customer);

        StoreOwner storeOwner=new StoreOwner();
        storeOwner.setUser(user3);
        storeOwnerRepository.save(storeOwner);

        System.out.println("admins saved: "+ adminRepository.count());
        System.out.println("Customers saved: "+ customerRepository.count() );
        System.out.println("users saved: "+userRepo.count());
        System.out.println("storeOwners saved: "+ storeOwnerRepository.count());
        System.out.println("objects created");
    }
}
