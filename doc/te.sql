select 団体.団体名,ユーザ管理.権限ID,団体.団体ID from 団体,ユーザ管理 where 団体カテゴリ = 'クラス' and 団体.団体ID = ( select 団体ID from ユーザ管理 where ID = 'x11g019' and rownum = 1 );
