package amandzhi.swaggerspring;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Api(tags = "MyDogs")
@RequestMapping("/api")
public class MyController {

    @GetMapping("/dogs")
    @ApiOperation("Получить список собак")
    @ApiResponse(code = 200, message = "Список собак успешно получен")
    public List<Dog> getDogs() {
        List<Dog> dogs = Arrays.asList(new Dog("jack", 2), new Dog("rax", 3));
        return dogs;
    }

    @GetMapping
    @ApiOperation("Получить имя собаки")
    @ApiResponse(code = 200, message = "Имя собаки успешно получено")
    public String getNameDog() {
        return "jack";
    }

}
