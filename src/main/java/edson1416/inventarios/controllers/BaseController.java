package edson1416.inventarios.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("inventario")
@CrossOrigin(value = "http://localhost:5173")   //puerto por default de Angular por los cross
public abstract class BaseController {
}
