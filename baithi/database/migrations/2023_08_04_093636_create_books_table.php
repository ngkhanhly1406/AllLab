<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    
    public function up()
    {
        Schema::create('books', function (Blueprint $table) {
            $table->increments('bookid');
            $table->Integer('authorid');
            $table->string('title');
            $table->string('ISBN');
            $table->smallInteger('pub_year');
            $table->tinyInteger('available');
            $table->timestamps();
        });
    }

    
    public function down()
    {
        Schema::dropIfExists('books');
    }
};
