
using EXAM112.Models;
using Microsoft.EntityFrameworkCore;
using System.Collections.Generic;

public class EmployeeContext : DbContext
{
    public EmployeeContext(DbContextOptions<EmployeeContext> options)
    : base(options)
    {
    }

    public DbSet<Employee> Employees { get; set; } = null!;
}
