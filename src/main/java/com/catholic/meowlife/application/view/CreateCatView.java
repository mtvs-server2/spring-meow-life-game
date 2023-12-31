package com.catholic.meowlife.application.view;

import com.catholic.meowlife.application.controller.CatController;
import com.catholic.meowlife.application.controller.LoginController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CreateCatView {
    private String catName;
    private String catBreeds;

    public void createCatView(){
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("");
                System.out.println("");

                System.out.println("                                                    　　　　　／＞　　フ");
                System.out.println("                                                    　　　　　| 　_　 _ l");
                System.out.println("                                                    　 　　　／` ミ＿Yノ");
                System.out.println("                                                    　　 　 /　　　 　 |");
                System.out.println("                                                    　　　 /　 ヽ　　 ﾉ");
                System.out.println("                                                    　 　 │　　|　|　|");
                System.out.println("                                                    　／￣|　　 |　|　|");
                System.out.println("                                                    　| (￣ヽ＿_ヽ_)__)");
                System.out.println("                                                    　＼二つ");
                System.out.println("");
                System.out.println("                                                    ⁜©Team CatHolic.⁜    ");
                System.out.println("");
                System.out.println("");

                System.out.print("입양하실 고양이의 이름을 지어주세요 : ");
                catName = sc.next();

                System.out.print("입양하실 고양이의 종을 선택해주세요. [1] 코숏 [2] 러시안블루 [3] 노르웨이숲 : ");
                catBreeds = sc.next();

                if (!("코숏".equals(catBreeds) || "러시안블루".equals(catBreeds) || "노르웨이숲".equals(catBreeds))) {
                    throw new IllegalArgumentException("종을 정확히 입력해주세요!!");
                }

                System.out.print("고양이를 다시 입양하시려면 숫자 9번을 입력해주세요. 원하지 않으면 9번을 제외한 다른 숫자를 입력해주세요. : ");
                int returnNumber = sc.nextInt();

                if (returnNumber != 9) {
                    break;
                }

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage().toString());
            }
        }
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.catholic.meowlife");

        CatController catController = context.getBean("catController", CatController.class);
        catController.createWhatCat(catName, catBreeds);
    }
}
