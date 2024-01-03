<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 1/2/2024
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="#" class="signup-container-content-item-2-form" method="post">
    <div class="signup-container-content-item-2-form-header">
        <div class="signup-container-content-item-2-form-header-item1">
            Đăng ký
        </div>
        <!-- <div class="signup-container-content-item-2-form-header-item2">
                <div
                  class="signup-container-content-item-2-form-header-item2-QRtext"
                >
                  Đăng nhập với mã QR
                </div>
                <div
                  class="signup-container-content-item-2-form-header-item2-QRicon"
                ></div>
              </div> -->
    </div>

    <div class="signup-container-content-item-2-form-body">
        <div class="signup-container-content-item-2-form-body-item-1">
            <input
                    type="email"
                    name="signup-email"
                    class="signup-container-content-item-2-form-body-item-1-inputEmail"
                    placeholder="Email"
                    required
                    onkeyup="checkInput(), messageCheckInput()"
                    onblur="messageCheckInput()"
            />
            <div class="invalidEmail-announce">Vui lòng điền vào mục này</div>
            <div
                    type="password"
                    class="signup-container-content-item-2-form-body-item-1-passwordBox"
            >
                <input
                        type="password"
                        class="signup-container-content-item-2-form-body-item-1-inputPassword"
                        placeholder="Mật khẩu"
                        name="signup-password"
                        id=""
                        required
                        onkeyup="checkInput(),messageCheckInput()"
                        onblur="messageCheckInput(),checkValidCorrectPassword(), checkRegexPassword()"
                />
                <div
                        class="signup-container-content-item-2-form-body-item-1-inputPassword-eyeIcon"
                        onclick="hideShowPassword()"
                >
                    <div
                            class="signup-container-content-item-2-form-body-item-1-inputPassword-openEyeIcon"
                    ></div>
                </div>
            </div>
            <div class="invalidPassword-announce">Vui lòng điền vào mục này</div>
            <div class="invalidRegexPassword-announce">
                Password dài 6-20 ký tự, có ít nhất 1 chữ thường, 1 chữ Hoa và 1 số
            </div>
            <div
                    type="password"
                    class="signup-container-content-item-2-form-body-item-1-passwordBox"
            >
                <input
                        type="password"
                        class="signup-container-content-item-2-form-body-item-1-inputCorrectPassword"
                        placeholder="Nhập lại mật khẩu"
                        name="signup-correct-password"
                        id=""
                        required
                        onkeyup="checkValidCorrectPassword(), checkInput()"
                        onblur="checkValidCorrectPassword(), checkInput()"
                />
                <div
                        class="signup-container-content-item-2-form-body-item-1-inputCorrectPassword-wrongIcon"
                >
                    <div
                            class="signup-container-content-item-2-form-body-item-1-inputCorrectPassword-checkIcon"
                    ></div>
                </div>
            </div>
            <div class="invalidCorrectPassword-announce">
                Mật khẩu xác nhận không khớp
            </div>
            <button
                    type="submit"
                    class="signup-container-content-item-2-form-body-item-1-submitsignup"
            >
                ĐĂNG KÝ
            </button>
        </div>
        <div class="signup-container-content-item-2-form-body-item-2">
            <div class="signup-container-content-item-2-form-body-item-2-middle">
                <div
                        class="signup-container-content-item-2-form-body-item-2-middle-side"
                ></div>
                <div
                        class="signup-container-content-item-2-form-body-item-2-middle-center"
                >
                    HOẶC
                </div>
                <div
                        class="signup-container-content-item-2-form-body-item-2-middle-side"
                ></div>
            </div>
            <div class="signup-container-content-item-2-form-body-item-2-bottom">
                <a
                        href="#"
                        class="signup-container-content-item-2-form-body-item-2-bottom-signupByFB"
                >
                    <div
                            class="signup-container-content-item-2-form-body-item-2-bottom-signupByFB-icon"
                    ></div>
                    <div
                            class="signup-container-content-item-2-form-body-item-2-bottom-signupByFB-text"
                    >
                        Facebook
                    </div>
                </a>
                <a
                        href="#"
                        class="signup-container-content-item-2-form-body-item-2-bottom-signupByGG"
                >
                    <div
                            class="signup-container-content-item-2-form-body-item-2-bottom-signupByGG-icon"
                    ></div>
                    <div
                            class="signup-container-content-item-2-form-body-item-2-bottom-signupByGG-text"
                    >
                        Google
                    </div>
                </a>
            </div>
            <div class="signup-container-content-item-2-form-body-item-2-top">
                <p
                        class="signup-container-content-item-2-form-body-item-2-top-item"
                >
                    Bằng việc đăng kí, bạn đã đồng ý với Shopee về <br />
                    <a
                            class="signup-container-content-item-2-form-body-item-2-top-item-link"
                            href="https://help.shopee.vn/portal/article/77243"
                    >Điều khoản dịch vụ</a
                    >
                    &
                    <a
                            class="signup-container-content-item-2-form-body-item-2-top-item-link"
                            href="https://help.shopee.vn/portal/article/77244"
                    >Chính sách bảo mật</a
                    >
                </p>
            </div>
        </div>
    </div>

    <div class="signup-container-content-item-2-form-footer">
        <div class="signup-container-content-item-2-form-footer-text">
            Bạn đã có tài khoản?
            <a
                    href="#"
                    class="signup-container-content-item-2-form-footer-text-signupLink"
            >Đăng nhập</a
            >
        </div>
    </div>
</form>
</body>
</html>
