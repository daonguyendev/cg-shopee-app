<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 1/3/2024
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<div class="product-body" >
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
            <c:forEach items="${products}" var="product">

                <div class="product-container-row2-item">
                    <div class="product-container-row2-item-information">${product.getId()}</div>
                    <div class="product-container-row2-item-information">
                        <img
                                class="product-container-row2-item-information-img"
                                src="${product.getUrl()}"
                                alt="product-avatar"
                        />
                    </div>
                    <div class="product-container-row2-item-information">
                            ${product.getName()}
                    </div>
                    <div class="product-container-row2-item-information">${product.getCategory()}</div>
                    <div class="product-container-row2-item-information">${product.getOriginUnitPrice()}</div>
                    <div class="product-container-row2-item-information">${product.getCurrentPrice()}</div>
                    <div class="product-container-row2-item-information">${product.getQuantity()}</div>
                    <div class="product-container-row2-item-information">
                        <span class="product-container-row2-item-information-edit ti-pencil"></span>
                        <a id="deleteLink" class="ti-trash product-container-row2-item-information-delete" href=""></a>
                        <form action="/product" method="post">
                            <input type="hidden" name="a" value="delete">
                            <input type="hidden" name="productId" value="${product.getId()}">

                            <div id="confirmationPopup" class="popup">
                                <div class="popup-content">
                                    <h3>Bạn có chắc là sẽ xóa sản phẩm này không ? </h3>
                                    <button id="cancelButton" type="reset">Không đồng ý</button>
                                    <button id="confirmButton">Đồng ý</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </c:forEach>
            <!-- Kết thúc sản phẩm -->
        </div>
    </div>
</div>

<!-- Form thêm sản phẩm -->
<div class="addProduct-container">
    <form method="post" action="/product" class="addProduct-container-form">
        <input type="hidden" name="a" value="update" accept-charset="UTF-8">
        <input type="text" name="a" id="a-form" hidden/>
        <input type="text" name="product-id" value="${product.getId()}" id="product-id-form" hidden/>
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
                    accept-charset="UTF-8"
                    required
            />
        </div>
        <div class="addProduct-container-form-item">
            <label
                    class="addProduct-container-form-item-label"
                    for="category-form"
            >Phân loại*</label
            >

            <select name="category" id="category-form"  accept-charset="UTF-8">
                <c:forEach items="${category}" var="categoryValue">
                    <option
<%--                            value="${categoryValue}"--%>
                    >${categoryValue}</option>
                </c:forEach>
            </select>

        </div>
        <div class="addProduct-container-form-item">
            <label
                    class="addProduct-container-form-item-label"
                    for="product-originPrice-form"
            >Giá gốc* (VNĐ)</label>
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
                    form="product-quantity"
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
                    form="product-urlAvatar"
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
                    name="modifyProduct"
            >
                Lưu
            </button>
        </div>
    </form>

</div>
<%--</div>--%>