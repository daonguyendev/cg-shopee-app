<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 1/2/2024
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form
        action="/user?a=singin"
        class="signin-container-content-item-2-form"
        method="post"
>
    <div class="signin-container-content-item-2-form-header">
        <div class="signin-container-content-item-2-form-header-item1">
            Đăng nhập
        </div>
        <div class="signin-container-content-item-2-form-header-item2">
            <div
                    class="signin-container-content-item-2-form-header-item2-QRtext"
            >
                Đăng nhập với mã QR
            </div>
            <div
                    class="signin-container-content-item-2-form-header-item2-QRicon"
            ></div>
        </div>
    </div>

    <div class="signin-container-content-item-2-form-body">
        <div class="signin-container-content-item-2-form-body-item-1">
            <input
                    type="email"
                    name="signin-email"
                    class="signin-container-content-item-2-form-body-item-1-inputEmail"
                    placeholder="Email"
                    required
                    onkeyup="checkInput()"
                    onblur="checkInputMessage()"
            />
            <div class="invalidEmail-announce">
                Vui lòng điền vào mục này
            </div>
            <div

                    class="signin-container-content-item-2-form-body-item-1-passwordBox"
            >
                <input
                        type="password"
                        class="signin-container-content-item-2-form-body-item-1-inputPassword"
                        placeholder="Mật khẩu"
                        name="signin-password"
                        id=""
                        required
                        onkeyup="checkInput()"
                        onblur="checkInputMessage()"
                />
                <div
                        class="signin-container-content-item-2-form-body-item-1-inputPassword-eyeIcon"
                        onclick="hideShowPassword()"
                >
                    <div
                            class="signin-container-content-item-2-form-body-item-1-inputPassword-openEyeIcon"
                    ></div>
                </div>
            </div>
            <div class="invalidPassword-announce">
                Vui lòng điền vào mục này
            </div>
            <button
                    type="submit"
                    class="signin-container-content-item-2-form-body-item-1-submitLogin"
            >
                ĐĂNG NHẬP
            </button>
        </div>
        <div class="signin-container-content-item-2-form-body-item-2">
            <div
                    class="signin-container-content-item-2-form-body-item-2-top"
            >
                <a
                        href="#"
                        class="signin-container-content-item-2-form-body-item-2-top-item"
                >Quên mật khẩu</a
                >
                <a
                        href="#"
                        class="signin-container-content-item-2-form-body-item-2-top-item"
                >Đăng nhập với SMS</a
                >
            </div>
            <div
                    class="signin-container-content-item-2-form-body-item-2-middle"
            >
                <div
                        class="signin-container-content-item-2-form-body-item-2-middle-side"
                ></div>
                <div
                        class="signin-container-content-item-2-form-body-item-2-middle-center"
                >
                    HOẶC
                </div>
                <div
                        class="signin-container-content-item-2-form-body-item-2-middle-side"
                ></div>
            </div>
            <div
                    class="signin-container-content-item-2-form-body-item-2-bottom"
            >
                <a
                        href="#"
                        class="signin-container-content-item-2-form-body-item-2-bottom-signinByFB"
                >
                    <div
                            class="signin-container-content-item-2-form-body-item-2-bottom-signinByFB-icon"
                    ></div>
                    <div
                            class="signin-container-content-item-2-form-body-item-2-bottom-signinByFB-text"
                    >
                        Facebook
                    </div>
                </a>
                <a
                        href="#"
                        class="signin-container-content-item-2-form-body-item-2-bottom-signinByGG"
                >
                    <div
                            class="signin-container-content-item-2-form-body-item-2-bottom-signinByGG-icon"
                    ></div>
                    <div
                            class="signin-container-content-item-2-form-body-item-2-bottom-signinByGG-text"
                    >
                        Google
                    </div>
                </a>
            </div>
        </div>
    </div>

    <div class="signin-container-content-item-2-form-footer">
        <div class="signin-container-content-item-2-form-footer-text">
            Bạn mới biết đến Shopee?
            <a
                    href="/signin-signup?a=signup"
                    class="signin-container-content-item-2-form-footer-text-registerLink"
            >Đăng ký</a
            >
        </div>
    </div>
</form>
</body>
</html>
