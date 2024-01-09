<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 1/2/2024
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="person-body">
    <div class="person-body-container">
        <div class="person-body-container-nav">
            <div class="person-body-container-nav-top">
                <div class="person-body-container-nav-top-avatar">
                    <img
                            src="https://down-vn.img.susercontent.com/file/vn-11134226-7r98o-lpghkncieudq53_tn"
                            alt="user-avatar"
                            class="person-body-container-nav-top-avatar-img"
                    />
                </div>
                <div class="person-body-container-nav-top-text">
                    <p class="person-body-container-nav-top-text-name">username</p>
                    <div class="person-body-container-nav-top-text-editContainer">
                        <span class="ti-pencil"></span>
                        <a href="" class="person-body-container-nav-top-text-edit"
                        >Sửa Hồ Sơ</a
                        >
                    </div>
                </div>
            </div>
            <!-- Nav body -->
            <div class="person-body-container-nav-body">
                <div
                        class="person-body-container-nav-body-item person-body-container-nav-body-item1"
                >
                    <div class="person-body-container-nav-body-item-icon">
                        <img
                                src="https://down-vn.img.susercontent.com/file/sg-11134004-7rbkw-lpfvsyaosmdz5e"
                                alt=""
                        />
                    </div>
                    <div class="person-body-container-nav-body-item-text">
                        <p>25.12 Lương Về Sale To</p>
                    </div>
                </div>
                <div
                        class="person-body-container-nav-body-item person-body-container-nav-body-item2"
                >
                    <div class="person-body-container-nav-body-item2-item">
                        <div class="person-body-container-nav-body-item-icon">
                            <img
                                    src="https://down-vn.img.susercontent.com/file/ba61750a46794d8847c3f463c5e71cc4"
                                    alt=""
                            />
                        </div>
                        <div
                                onclick="showHideList()"
                                class="person-body-container-nav-body-item-text person-body-container-nav-body-item2-item-header"
                        >
                            <p>Tài Khoản Của Tôi</p>
                        </div>
                    </div>
                    <div
                            class="person-body-container-nav-body-item2-item person-body-container-nav-body-item2-item-listItem"
                    >
                        <div class="person-body-container-nav-body-item-icon"></div>
                        <div class="person-body-container-nav-body-item-text">
                            <p>Hồ Sơ</p>
                        </div>
                    </div>
                    <div
                            class="person-body-container-nav-body-item2-item person-body-container-nav-body-item2-item-listItem"
                    >
                        <div class="person-body-container-nav-body-item-icon"></div>
                        <div class="person-body-container-nav-body-item-text">
                            <p>Ngân Hàng</p>
                        </div>
                    </div>
                    <div
                            class="person-body-container-nav-body-item2-item person-body-container-nav-body-item2-item-listItem"
                    >
                        <div class="person-body-container-nav-body-item-icon"></div>
                        <div class="person-body-container-nav-body-item-text">
                            <p>Địa Chỉ</p>
                        </div>
                    </div>

                    <div
                            class="person-body-container-nav-body-item2-item person-body-container-nav-body-item2-item-listItem"
                    >
                        <div class="person-body-container-nav-body-item-icon"></div>
                        <div class="person-body-container-nav-body-item-text">
                            <p>Cài Đặt Thông Báo</p>
                        </div>
                    </div>
                </div>
                <div
                        class="person-body-container-nav-body-item person-body-container-nav-body-item3"
                >
                    <div class="person-body-container-nav-body-item-icon">
                        <img
                                src="https://down-vn.img.susercontent.com/file/f0049e9df4e536bc3e7f140d071e9078"
                                alt=""
                        />
                    </div>
                    <div class="person-body-container-nav-body-item-text">
                        <p>Đơn Mua</p>
                    </div>
                </div>
                <div
                        class="person-body-container-nav-body-item person-body-container-nav-body-item4"
                >
                    <div class="person-body-container-nav-body-item-icon">
                        <img
                                src="https://down-vn.img.susercontent.com/file/e10a43b53ec8605f4829da5618e0717c"
                                alt=""
                        />
                    </div>
                    <div class="person-body-container-nav-body-item-text">
                        <p>Thông Báo</p>
                    </div>
                </div>
                <div
                        class="person-body-container-nav-body-item person-body-container-nav-body-item5"
                >
                    <div class="person-body-container-nav-body-item-icon">
                        <img
                                src="https://down-vn.img.susercontent.com/file/84feaa363ce325071c0a66d3c9a88748"
                                alt=""
                        />
                    </div>
                    <div class="person-body-container-nav-body-item-text">
                        <p>Kho Voucher</p>
                    </div>
                </div>
                <div
                        class="person-body-container-nav-body-item person-body-container-nav-body-item6"
                >
                    <div class="person-body-container-nav-body-item-icon">
                        <img
                                src="	https://down-vn.img.susercontent.com/file/a0ef4bd8e16e481b4253bd0eb563f784"
                                alt=""
                        />
                    </div>
                    <div class="person-body-container-nav-body-item-text">
                        <p>Shopee Xu</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="person-body-container-content">
            <div class="person-body-container-content-top">
                <h1 class="person-body-container-content-top-title">
                    Hồ Sơ Của Tôi
                </h1>
                <div class="person-body-container-content-top-content">
                    Quản lý thông tin hồ sơ để bảo mật tài khoản
                </div>
            </div>
            <div class="person-body-container-content-bottom">
                <form action="/user" method="post" class="person-body-container-content-bottom-left">
                    <input style="display: none" name="action" value="saveChange">
                    <div class="person-body-container-content-bottom-left-row">
                        <div
                                class="person-body-container-content-bottom-left-row-label"
                        >
                            Email
                        </div>
                        <div
                                class="person-body-container-content-bottom-left-row-value"
                        >
                            ${user.getEmail()}
                        </div>
                    </div>
                    <div class="person-body-container-content-bottom-left-row">
                        <div
                                class="person-body-container-content-bottom-left-row-label"
                        >
                            Tên
                        </div>
                        <div
                                class="person-body-container-content-bottom-left-row-value"
                        >
                            <input
                                    placeholder="Chưa cập nhật"
                                    type="text"
                                    name="name"
                                    class="person-body-container-content-bottom-left-row-value-input"
                                    value="${user.getName()}"
                            />
                        </div>
                    </div>
                    <div class="person-body-container-content-bottom-left-row">
                        <div
                                class="person-body-container-content-bottom-left-row-label"
                        >
                            Password
                        </div>
                        <div
                                class="person-body-container-content-bottom-left-row-value changePassword"
                        >
                            Bấm vào đây để thay đổi mật khẩu
                        </div>
                    </div>
                    <div class="person-body-container-content-bottom-left-row">
                        <div
                                class="person-body-container-content-bottom-left-row-label"
                        >
                            Số điện thoại
                        </div>
                        <div
                                class="person-body-container-content-bottom-left-row-value"
                        >
                            ********${sdt}
                            <p
                                    class="person-body-container-content-bottom-left-row-value changePhoneNumber"
                            >
                                Bấm vào đây để thay đổi số điện thoại
                            </p>
                        </div>
                    </div>

                    <div class="person-body-container-content-bottom-left-row">
                        <div
                                class="person-body-container-content-bottom-left-row-label"
                        >
                            Giới tính
                        </div>
                        <div
                                class="person-body-container-content-bottom-left-row-value"
                        >
                            <div
                                    class="person-body-container-content-bottom-left-row-value-radioGroup"
                            >
                                <input type="radio" name="gender" id="nam" value="nam"
                                       <c:if test="${user.getGender() eq 'nam'}">
                                            checked
                                       </c:if>>

                                <label for="nam">Nam</label>
                            </div>
                            <div
                                    class="person-body-container-content-bottom-left-row-value-radioGroup"
                            >
                                <input type="radio" name="gender" id="nu" value="nu"
                                       <c:if test="${user.getGender() eq 'nu'}">
                                            checked
                                       </c:if>>

                                <label for="nu">Nữ</label>
                            </div>
                            <div
                                    class="person-body-container-content-bottom-left-row-value-radioGroup"
                            >
                                <input type="radio" name="gender" id="khac" value="khac"
                                       <c:if test="${user.getGender() eq 'khac'}">
                                            checked
                                       </c:if>>
                                <label for="khac">Khác</label>
                            </div>
                        </div>
                    </div>
                    <div class="person-body-container-content-bottom-left-row">
                        <div
                                class="person-body-container-content-bottom-left-row-label"
                        >
                            Ngày Sinh
                        </div>
                        <div
                                class="person-body-container-content-bottom-left-row-value"
                        >
                            <div
                                    class="person-body-container-content-bottom-left-row-value-dayOfBirth"
                            >
                                <input name="dayOfBirth" type="date" value="${user.getDateOfBirth()}" />
                            </div>
                            <div
                                    class="person-body-container-content-bottom-left-row-value-selectGroup"
                            ></div>
                            <div
                                    class="person-body-container-content-bottom-left-row-value-selectGroup"
                            ></div>
                        </div>
                    </div>
                    <div class="person-body-container-content-bottom-left-row">
                        <div
                                class="person-body-container-content-bottom-left-row-label button"
                        >
                            Button
                        </div>
                        <div
                                class="person-body-container-content-bottom-left-row-value"
                        >
                            <button
                                    class="person-body-container-content-bottom-left-row-value-button save-change"
                                    type="submit"
                            >
                                Lưu
                            </button>
                        </div>
                    </div>
                </form>
                <div class="person-body-container-content-bottom-right">
                    <div class="person-body-container-content-bottom-right-top">
                        <div
                                class="person-body-container-content-bottom-right-top-avatar"
                        ></div>
                    </div>
                    <div class="person-body-container-content-bottom-right-mid">
                        <form
                                class="person-body-container-content-bottom-right-mid-form"
                                method="get"
                                enctype="multipart/form-data"
                                action=""
                        >
                            <label for="profile_pic">Chọn ảnh</label>
                            <input
                                    type="file"
                                    id="profile_pic"
                                    name="profile_pic"
                                    accept=".jpg, .jpeg, .png"
                            />
                            <button type="submit">Lưu ảnh</button>
                        </form>
                    </div>
                    <div class="person-body-container-content-bottom-right-bottom">
                        <p>Định dạng:.JPEG, .PNG</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="changeForm-container">
<form class="form-changePassword" method="post" action="/user">
    <input style="display: none" name="action" value="changePassword">
    <label>Mật khẩu cũ: <br><input type="password" name="oldPW"></label>
    <label>Mật khẩu mới: <br><input type="password" name="newPW"></label>
    <label>Nhập lại mật khẩu mới: <br><input type="password" name="newAgainPW"></label>

    <button class="formChange-submit" type="submit">Lưu</button>
    <span class="ti-close"></span>
</form>
<form class="form-changePhoneNumber" method="post" action="/user">
    <input style="display: none" name="action" value="changePhoneNumber">
    <label>SĐT cũ: <br><input name="oldPN"></label>
    <label>SĐT mới: <br><input name="newPN"></label>
    <label>Nhập lại SĐT: <br><input name="newAgainPN"></label>
    <button class="formChange-submit" type="submit">Lưu</button>
    <span class="ti-close"></span>
</form>
</div>
<script>

</script>
</body>
</html>
