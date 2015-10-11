<html>
<body>
<form name="add_address" method="POST">
    <div>
        Country:<select>
             <option value="USA">UNITED_STATES</option>
             <option value="United Kingdom">UNITED_KINGDOM</option>
             <option value="Ukraine">UKRAINE</option>
             <option value="Russia">RUSSIAN_FEDERATION</option>
             <option value="Germany">GERMANY</option>

    </select>
    </div>
    <div>Address: <input id="address" maxlength="40" name="address" placeholder="Enter address..." size="40" value=""></div>
    <div>Phone 1: <input class="phone" maxlength="15" name="phone1" placeholder="Enter phone..." size="40" value=""></div>
    <div>Phone 2: <input class="phone" maxlength="15" name="phone2" placeholder="Enter phone..." size="40" value=""></div>
    <div>Phone 3: <input class="phone" maxlength="15" name="phone3" placeholder="Enter phone..." size="40" value=""></div>
    <div>Phone 4: <input class="phone" maxlength="15" name="phone4" placeholder="Enter phone..." size="40" value=""></div>
    <div>Phone 5: <input class="phone" maxlength="15" name="phone5" placeholder="Enter phone..." size="40" value=""></div>

    <button class="button" id="add_button" style="border: solid black">ADD</button>
</form>
</body>
</html>
