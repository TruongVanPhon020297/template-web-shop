//package com.cg.controller.api;
//
//
//import com.cg.exception.DataInputException;
//import com.cg.model.ProductDemo;
//import com.cg.model.dto.IProductDTO;
//import com.cg.model.dto.ProductDTO;
//import com.cg.service.ProductService;
//import com.cg.utils.AppUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataIntegrityViolationException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Optional;
//
//
//@RestController
//@RequestMapping("/api/products")
//public class ProductAPI {
//
//    @Autowired
//    private ProductService productService;
//
//    @Autowired
//    private AppUtils appUtils;
//
//
//    @GetMapping
//    public ResponseEntity<Iterable<?>> findAll() {
//        try {
//            Iterable<IProductDTO> iProductDTOS = productService.findAllIProductDTO();
//
//            if (((List) iProductDTOS).isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//
//            return new ResponseEntity<>(iProductDTOS, HttpStatus.OK);
//
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<?> create(@Validated ProductDTO productDTO, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors())
//            return appUtils.mapErrorToResponse(bindingResult);
//
//        try {
//            ProductDemo createdProductDemo = productService.create(productDTO);
//
//            IProductDTO iProductDTO =  productService.findIProductDTOById(createdProductDemo.getId());
//
//            return new ResponseEntity<>(iProductDTO, HttpStatus.CREATED);
//
//        } catch (DataIntegrityViolationException e) {
//            throw new DataInputException("Product creation information is not valid, please check the information again");
//        }
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) throws IOException {
//
//        Optional<ProductDemo> product = productService.findById(id);
//
//        if (product.isPresent()) {
//            productService.delete(product.get());
//
//            return new ResponseEntity<>(HttpStatus.ACCEPTED);
//        } else {
//            throw new DataInputException("Invalid product information");
//        }
//    }
//
//}