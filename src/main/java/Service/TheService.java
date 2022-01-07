package Service;

import Controller.Dto.TheDto;

public class TheService {
    public String TDto(TheDto thedto){
        System.out.println(thedto.getBb()+" =bb");
        System.out.println(thedto.getCc()+" =cc");
        System.out.println(thedto.getCc()+" =ee");
        return null;

    }
}
