<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add A Book</title>
</head>
<body>
<div class="container">
	<div class="row">
		 <form class="form-horizontal" action = BookAction>
            <fieldset>
         
         
                <div class="control-group">
                    <label class="control-label">Title</label>
                    <div class="controls">
                        <input id="title" name="title" type="text" placeholder="title"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                
                <div class="control-group">
                    <label class="control-label">Author</label>
                    <div class="controls">
                        <input id="author" name="author" type="text" placeholder="author"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
                  <!--Gender-->
                <div class="control-group">
                    <label class="control-label">Price</label>
                    <div class="controls">
                        <input id="price" name="price" type="text" placeholder="price"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
       
                <div class="control-group">
                    <label class="control-label">Category</label>
                    <div class="controls">
                        <input id="category" name="category" type="text" placeholder="category"
                        class="input-xlarge">
                        <p class="help-block"></p>
                    </div>
                </div>
          
           
                <div class="control-group">
                  <button class="btn btn-primary">Add Book</button>
                    
                </div>
            </fieldset>
        </form>
	</div>

</body>

</html>
