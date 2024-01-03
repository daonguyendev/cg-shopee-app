<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 1/3/2024
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>


<div class="product-body">
    <div class="product-container">
        <div class="product-container-row1">
            <div class="product-container-row1-item">id</div>
            <div class="product-container-row1-item">Hình ảnh</div>
            <div class="product-container-row1-item">Tên sản phẩm</div>
            <div class="product-container-row1-item">Phân loại</div>
            <div class="product-container-row1-item">Giá gốc</div>
            <div class="product-container-row1-item">Giá bán</div>
            <div class="product-container-row1-item">Số lượng</div>
            <div class="product-container-row1-item">Thao tác</div>
        </div>

        <div class="product-container-buttonContainer">
            <button
                    type="button"
                    class="product-container-buttonContainer-addButton"
            >
                Thêm sản phẩm
            </button>
        </div>

        <div class="product-container-row2">
            <!-- Sản phẩm -->
            <div class="product-container-row2-item">
                <div class="product-container-row2-item-information">1</div>
                <div class="product-container-row2-item-information">
                    <img
                            class="product-container-row2-item-information-img"
                            src="https://down-vn.img.susercontent.com/file/sg-11134201-7rblr-lo2dz1cwu1f4b6"
                            alt="product-avatar"
                    />
                </div>
                <div class="product-container-row2-item-information">
                    Chuột logitech
                </div>
                <div class="product-container-row2-item-information">audi</div>
                <div class="product-container-row2-item-information">20000</div>
                <div class="product-container-row2-item-information">18000</div>
                <div class="product-container-row2-item-information">200</div>
                <div class="product-container-row2-item-information">
              <span
                      class="product-container-row2-item-information-edit ti-pencil"
              ></span>
                    <a
                            class="ti-trash product-container-row2-item-information-delete"
                            href=""
                    ></a>
                </div>
            </div>
            <!-- Kết thúc sản phẩm -->
            <!-- Sản phẩm -->
            <div class="product-container-row2-item">
                <div class="product-container-row2-item-information">1</div>
                <div class="product-container-row2-item-information">
                    <img
                            class="product-container-row2-item-information-img"
                            src="https://down-vn.img.susercontent.com/file/sg-11134201-7rblr-lo2dz1cwu1f4b6"
                            alt="product-avatar"
                    />
                </div>
                <div class="product-container-row2-item-information">
                    Chuột logitech G403
                </div>
                <div class="product-container-row2-item-information">audi</div>
                <div class="product-container-row2-item-information">30000</div>
                <div class="product-container-row2-item-information">18000</div>
                <div class="product-container-row2-item-information">100</div>
                <div class="product-container-row2-item-information">
              <span
                      class="product-container-row2-item-information-edit ti-pencil"
              ></span>
                    <a
                            class="ti-trash product-container-row2-item-information-delete"
                            href=""
                    ></a>
                </div>
            </div>
            <!-- Kết thúc sản phẩm -->
          </div>
        </div>
      </div>

      <!-- Form thêm sản phẩm -->
            <div class="addProduct-container">
                <form method="post" action="" class="addProduct-container-form">
                    <input type="text" name="a" id="a-form" hidden />
                    <input type="text" name="product-id" id="product-id-form" hidden />
                    <div class="addProduct-container-form-cancel">
                        <span class="ti-close addProduct-container-form-cancel-button"></span>
                    </div>
                    <div class="addProduct-container-form-item">
                        <label class="addProduct-container-form-item-label" for="product-name-form"
                        >Tên sản phẩm*</label
                        >
                        <input
                                class="addProduct-container-form-item-input"
                                type="text"
                                name="product-name"
                                id="product-name-form"
                                required
                        />
                    </div>
                    <div class="addProduct-container-form-item">
                        <label
                                class="addProduct-container-form-item-label"
                                for="category-form"
                        >Phân loại*</label
                        >
                        <select name="category" id="category-form">
                            <option value="volvo">volvo</option>
                            <option value="saab">saab</option>
                            <option value="mercedes">mercedes</option>
                            <option value="audi">audi</option>
                        </select>
                    </div>
                    <div class="addProduct-container-form-item">
                        <label
                                class="addProduct-container-form-item-label"
                                for="product-originPrice-form"
                        >Giá gốc* (VNĐ)</label
                        >
                        <input
                                class="addProduct-container-form-item-input"
                                type="text"
                                name="product-originPrice"
                                id="product-originPrice-form"
                                required
                        />
                    </div>
                    <div class="addProduct-container-form-item">
                        <label
                                class="addProduct-container-form-item-label"
                                for="product-sellPrice-form"
                        >Giá bán* (VNĐ)</label
                        >
                        <input
                                class="addProduct-container-form-item-input"
                                type="text"
                                name="product-sellPrice"
                                id="product-sellPrice-form"
                                required
                        />
                    </div>
                    <div class="addProduct-container-form-item">
                        <label
                                class="addProduct-container-form-item-label"
                                for="product-quantity"
                        >Số lượng*</label
                        >
                        <input
                                class="addProduct-container-form-item-input"
                                type="text"
                                name="product-quantity"
                                id="product-quantity-form"
                                required
                        />
                    </div>
                    <div class="addProduct-container-form-item">
                        <label
                                class="addProduct-container-form-item-label"
                                for="product-urlAvatar"
                        >Link ảnh sản phẩm*</label
                        >
                        <input
                                class="addProduct-container-form-item-input"
                                type="url"
                                name="product-urlAvatar"
                                id="product-urlAvatar-form"
                                required
                        />
                    </div>
                    <div class="addProduct-container-form-buttonGroup">
                        <button
                                class="addProduct-container-form-buttonGroup-cancel"
                                type="button"
                        >
                            Hủy
                        </button>
                        <button
                                class="addProduct-container-form-buttonGroup-save"
                                type="submit"
                        >
                            Lưu
                        </button>
                    </div>
                </form>
            </div>
