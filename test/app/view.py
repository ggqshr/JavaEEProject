#encoding: utf-8
from app import app
@app.route("/")
def index():
    return "hello,world!"