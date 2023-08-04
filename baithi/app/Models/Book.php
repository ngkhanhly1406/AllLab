<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Book extends Model
{
    public $fillable = [
        'authorid',
        'title',
        'ISBN',
        'PUB_year',
        'availiable',
    ];
    use HasFactory;
}
