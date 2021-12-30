INSERT INTO `member` (`ssn`, `name`, `title`, `description`, `icon`, `email`, `phone_number`) VALUES (0, 'Member 1', 'UI/UX Specialist', 'I''m always thinking one step ahead, like a carpenter that makes stairs.', '/img/person1.jpg', 'ritditdit@dodoo.com', 7348624);
INSERT INTO `member` (`ssn`, `name`, `title`, `description`, `icon`, `email`, `phone_number`) VALUES (1, 'Member 2', 'Backend Developer', 'Close your eyes. Picture a convict. What''s he wearing? Nothing special - baseball cap on backward, baggy pants. He says something ordinary like, "Yo, that''s shizzle". Okay, now slowly open your eyes again. Who are you picturing? A black man? Wrong. That was a white woman. Surprised? Well, shame on you.', '/img/person2.jpg', 'michaelscott@office.com', 6172461);
INSERT INTO `member` (`ssn`, `name`, `title`, `description`, `icon`, `email`, `phone_number`) VALUES (2, 'Member 3', 'CEO', 'Michael is like Mozart, and I''m like Butch Cassidy. You mess with Mozart and you''re gonna get bullet in your head, courtesy of Butch Cassidy.', '/img/person3.jpg', 'dunderhead@lukeduke.com', 9063041);

INSERT INTO `endpoint` (`path`, `method`, `description`, `example_request`, `example_response`) VALUES ('/api/code/new', 'POST', 'Uploads a code snippet to the platform.', 'curl --url https://www.csp.com/api/code/new --request POST --header "Content-Type: application/json" --data ''{"code": "...code...(required)","time": #optional#,"views": #optional#}''', '{"id": "c2c20b3e-b1b9-4e08-843d-d4e1bfb76b48"}');
INSERT INTO `endpoint` (`path`, `method`, `description`, `example_request`, `example_response`) VALUES ('/api/code/{id}', 'GET', 'Attempts to pull a code snippet with the passed UUID.', 'curl --url https://www.csp.com/api/code/c2c20b3e-b1b9-4e08-843d-d4e1bfb76b48 --request GET', '{"id": "c2c20b3e-b1b9-4e08-843d-d4e1bfb76b48","code": "....code....","date": "EEE. MMM. dd yyyy ''@'' HH:mm:ss a","time": ###,"views": ###}');
INSERT INTO `endpoint` (`path`, `method`, `description`, `example_request`, `example_response`) VALUES ('/api/code/latest', 'GET', 'Attempts to pull the 10 latest code snippets.', 'curl --url https://www.csp.com/api/code/latest --request GET', '[{"id": "c2c20b3e-b1b9-4e08-843d-d4e1bfb76b48","code": "....code 1....","date": "EEE. MMM. dd yyyy ''@'' HH:mm:ss a","time": ###,"views": ###}, {"id": "2199d6c5-da29-4e0f-b8f4-bbd0eaf03403","code": "....code 2....","date": "EEE. MMM. dd yyyy ''@'' HH:mm:ss a","time": ###,"views": ###}]');
