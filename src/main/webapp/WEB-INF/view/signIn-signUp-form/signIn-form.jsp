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
        action="#"
        class="login-container-content-item-2-form"
        method="post"
>
    <div class="login-container-content-item-2-form-header">
        <div class="login-container-content-item-2-form-header-item1">
            Đăng nhập
        </div>
        <div class="login-container-content-item-2-form-header-item2">
            <div
                    class="login-container-content-item-2-form-header-item2-QRtext"
            >
                Đăng nhập với mã QR
            </div>
            <div
                    class="login-container-content-item-2-form-header-item2-QRicon"
            ></div>
        </div>
    </div>

    <div class="login-container-content-item-2-form-body">
        <div class="login-container-content-item-2-form-body-item-1">
            <input
                    type="email"
                    name="login-email"
                    class="login-container-content-item-2-form-body-item-1-inputEmail"
                    placeholder="Email"
                    required
                    onkeyup="checkInput()"
                    onblur="messageCheckInput()"
            />
            <div class="invalidEmail-announce">
                Vui lòng điền vào mục này
            </div>
            <div

                    class="login-container-content-item-2-form-body-item-1-passwordBox"
            >
                <input
                        type="password"
                        class="login-container-content-item-2-form-body-item-1-inputPassword"
                        placeholder="Mật khẩu"
                        name="login-password"
                        id=""
                        required
                        onkeyup="checkInput()"
                        onblur="messageCheckInput()"
                />
                <div
                        class="login-container-content-item-2-form-body-item-1-inputPassword-eyeIcon"
                        onclick="hideShowPassword()"
                >
                    <div
                            class="login-container-content-item-2-form-body-item-1-inputPassword-openEyeIcon"
                    ></div>
                </div>
            </div>
            <div class="invalidPassword-announce">
                Vui lòng điền vào mục này
            </div>
            <button
                    type="submit"
                    class="login-container-content-item-2-form-body-item-1-submitLogin"
            >
                ĐĂNG NHẬP
            </button>
        </div>
        <div class="login-container-content-item-2-form-body-item-2">
            <div
                    class="login-container-content-item-2-form-body-item-2-top"
            >
                <a
                        href="#"
                        class="login-container-content-item-2-form-body-item-2-top-item"
                >Quên mật khẩu</a
                >
                <a
                        href="#"
                        class="login-container-content-item-2-form-body-item-2-top-item"
                >Đăng nhập với SMS</a
                >
            </div>
            <div
                    class="login-container-content-item-2-form-body-item-2-middle"
            >
                <div
                        class="login-container-content-item-2-form-body-item-2-middle-side"
                ></div>
                <div
                        class="login-container-content-item-2-form-body-item-2-middle-center"
                >
                    HOẶC
                </div>
                <div
                        class="login-container-content-item-2-form-body-item-2-middle-side"
                ></div>
            </div>
            <div
                    class="login-container-content-item-2-form-body-item-2-bottom"
            >
                <a
                        href="#"
                        class="login-container-content-item-2-form-body-item-2-bottom-loginByFB"
                >
                    <div
                            class="login-container-content-item-2-form-body-item-2-bottom-loginByFB-icon"
                    ></div>
                    <div
                            class="login-container-content-item-2-form-body-item-2-bottom-loginByFB-text"
                    >
                        Facebook
                    </div>
                </a>
                <a
                        href="#"
                        class="login-container-content-item-2-form-body-item-2-bottom-loginByGG"
                >
                    <div
                            class="login-container-content-item-2-form-body-item-2-bottom-loginByGG-icon"
                    ></div>
                    <div
                            class="login-container-content-item-2-form-body-item-2-bottom-loginByGG-text"
                    >
                        Google
                    </div>
                </a>
            </div>
        </div>
    </div>

    <div class="login-container-content-item-2-form-footer">
        <div class="login-container-content-item-2-form-footer-text">
            Bạn mới biết đến Shopee?
            <a
                    href="http://127.0.0.1:5500/register.html"
                    class="login-container-content-item-2-form-footer-text-registerLink"
            >Đăng ký</a
            >
        </div>
    </div>
</form>
</body>
</html>
