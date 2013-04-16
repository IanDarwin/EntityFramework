-- SAMPLE DATA ONLY

-- Some Frameworks
insert into frameworks (id,name,url,year,sponsor,shortdesc,longdesc,implsubdir,licencetype,type,mod_date,language,version) values(1, 'Struts', 'http://struts.apache.org/', 1999, 'Apache Software Foundation', 'The original Java MVC web framework.', 'The original Java MVC web framework.', 'struts', 'ASL', 'MVC'  , '2009-04-11', 'j', 0)
insert into frameworks (id,name,url,year,sponsor,shortdesc,longdesc,implsubdir,licencetype,type,mod_date,language,version) values(2, 'Velocity', 'http://velocity.apache.org/', 2000, 'Apache Software Foundation', 'Template engine', 'A widely used templating engine.', null, 'ASL-2', 'V' , null, 'j', 0)
insert into frameworks (id,name,url,year,sponsor,shortdesc,longdesc,implsubdir,licencetype,type,mod_date,language,version) values(3, 'ActionServlet', 'http://www.actionframework.org/', 2000, 'Petr Toman', 'Simple MVC framework?', 'Simpler than Struts, but not as much infrastructure.', null, null, 'C', null, 'j', 0)

-- And some Usage examples
insert into usage (id, company,domain,framework,howknown,version) values(11, 'Canada Post','canadapost.ca', 'JSF', 'URL names', 0);
insert into usage (id, company, domain, howknown, bus_type, mod_date, version) values( 1, 'Best Buy', 'bestbuy.com', 'Developer', 'Electronics', '2009-04-10', 0)
insert into usage (id, company, domain, howknown, bus_type, mod_date, version) values( 2, 'Canadian Tire', 'canadiantire.com', 'Page names *.jsp', 'Big box Hardware/Automotive', '2009-04-12', 0)
insert into usage (id, company, domain, howknown, bus_type, mod_date, version) values( 3, 'LinkedIn', 'linkedin.com', 'http://www.slideshare.net/linkedin/linkedins-communication-architecture', 'Social Networking', '2009-04-10', 0)
insert into usage (id, company, domain, howknown, bus_type, mod_date, version) values( 7, 'U.S. Postal Service', 'usps.gov', 'http://java.sun.com/nav/used/', 'Mail delivery', '2009-04-10', 0)
insert into usage (id, company, domain, howknown, bus_type, mod_date, version) values( 9, 'partypoker.com', 'partypoker.com', 'Developer', 'Online Gaming site', '2009-04-10', 0)
