package controller;

import dao.CategoryDAO;
import entity.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class CategoryController implements Serializable {

    private List<Category> categoryList;
    private CategoryDAO categoryDAO;
    private Category category;


    public String create () {
        this.getCategoryDAO().insert(this.category);
        this.category = new Category();
        return "index";
    }

    public String delete () {
        this.getCategoryDAO().delete(this.category);
        this.category = new Category();
        return "index";
    }

    public String updateForm (Category category) {
        this.category = category;
        return "index";
    }

    public String update () {
        this.getCategoryDAO().update(this.category);
        this.category = new Category();
        return "index";
    }

    public String clearForm () {
        this.category = new Category();
        return "index";
    }

    public String deleteConfirm (Category category) {
        this.category = category;
        return "confirmDelete";
    }

    public List<Category> getCategoryList() {
        this.categoryList = this.getCategoryDAO().findAll();
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    private CategoryDAO getCategoryDAO() {
        if(this.categoryDAO == null)
            this.categoryDAO = new CategoryDAO();
        return categoryDAO;
    }

    public void setCategoryDAO(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    public Category getCategory() {
        if(this.category == null)
            this.category = new Category();
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}