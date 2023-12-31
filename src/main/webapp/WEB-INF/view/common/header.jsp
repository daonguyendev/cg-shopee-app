<%@ page import="com.codegym.cgshopeeapp.model.entity.User" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/29/2023
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<c:set var="user" value='${sessionScope["user"]}'/>
<c:set var="money" value='${sessionScope["money"]}'/>
<div class="header-under">

</div>

<div class="header">
    <div class="header-container">
        <div class="header-container-row1">
            <div class="header-container-row1-left">
                <a href="/product" class="header-container-row1-left-item"
                >Kênh người bán</a
                >
                <div class="header-container-row1-left-item">|</div>
                <a href="/seller" class="header-container-row1-left-item">
                    Trở thành người bán
                </a>
                <div class="header-container-row1-left-item">|</div>
                <a href="" class="header-container-row1-left-item">Tải ứng dụng</a>
                <div class="header-container-row1-left-item">|</div>
                <div class="header-container-row1-left-item">Kết nối</div>
                <div class="header-container-row1-left-item icon">
                    <a
                            class="header-container-row1-left-item-iconFB"
                            href="https://www.facebook.com/ShopeeVN"
                    ></a>
                    <a
                            class="header-container-row1-left-item-iconIG"
                            href="https://www.instagram.com/Shopee_VN/"
                    ></a>
                </div>

            </div>
            <div class="header-container-row1-right">
                <div class="header-container-row1-right-item">
                    <span class="ti-wallet"></span> ${money}
                </div>
                <div class="header-container-row1-right-item">
                    <span class="ti-bell"></span> Thông báo
                </div>
                <a href="" class="header-container-row1-right-item">
                    <span class="ti-help-alt"></span> Hỗ trợ
                </a>
                <div class="header-container-row1-right-item">
                    <span class="ti-world"></span> Tiếng Việt
                </div>


                <c:choose>
                    <c:when test="${empty user}">
                        <a href="/signin-signup?a=signup" class="header-container-row1-right-item">Đăng Ký</a>
                        <div class="header-container-row1-right-item">|</div>
                        <a href="/signin-signup?a=signin" class="header-container-row1-right-item">Đăng Nhập</a>
                    </c:when>

                    <c:otherwise>
                        <a href="/user?a=ui" class="header-container-row1-right-item">${user.getName()}</a>
                        <a href="/signin-signup?a=signout" class="header-container-row1-right-item">Đăng xuất</a>

                    </c:otherwise>
                </c:choose>


            </div>
        </div>
        <div class="header-container-row2">
            <a href="/home" class="header-container-row2-left"></a>

            <div class="header-container-row2-center">
                <form action="/home/search" method="get" class="header-container-row2-center-searchContainer">
                    <input
                            type="text"
                            name="searchBar"
                            id="searchBar"
                            class="header-container-row2-center-searchContainer-searchBar"
                            placeholder="Shopee bao ship 0Đ - Đăng ký ngay!"
                    />
                    <button type="submit"
                            class="header-container-row2-center-searchContainer-searchIcon"
                    >
                        <span class="ti-search"></span>
                    </button>
                </form>
            </div>
            <a href="/cart" class="header-container-row2-right">
                <div class="header-container-row2-right-icon"></div>
            </a>
        </div>
        <div class="header-container-row3">
            <div class="header-container-row3-left"></div>
            <div class="header-container-row3-center">
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
                <a href="" class="header-container-row3-center-item"
                >Vợt cầu lông</a
                >
            </div>
            <div class="header-container-row3-right"></div>
        </div>
    </div>
</div>

