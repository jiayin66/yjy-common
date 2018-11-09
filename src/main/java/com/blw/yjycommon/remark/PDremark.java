package com.blw.yjycommon.remark;
/**
 * [1] 复制以下代码可以实现列名小写转大写
 * [2]以下命令可以把名字加载备注中
 * ------------------------------------
 * 
 * [1] 复制以下代码可以实现列名小写转大写
 '大小写转换，目标为大写
Option Explicit
ValidationMode = True
InteractiveMode = im_Batch
Dim mdl ' the current model
'取得当前Model
Set mdl = ActiveModel
If (mdl Is Nothing) Then
 MsgBox "There is no current Model"
ElseIf Not mdl.IsKindOf(PdPDM.cls_Model) Then
 MsgBox "The current model is not an Physical Data model."
Else
 ProcessFolder mdl
End If
 
Private sub ProcessFolder(folder)
  '处理表
 Dim Tab
 for each Tab in folder.tables
   tab.code = UCase(tab.code)
   '修改字段名
   Dim col
   for each col in tab.columns
    col.code= UCase(col.code)
   next
   '修改索引名
   Dim idx
   for each idx in tab.indexes
    idx.code= UCase(idx.code)
   next
   '修改主键名
   Dim key
   for each key in tab.keys
    key.code= UCase(key.code)
   next
 next
' 同理处理视图
' Dim view
' for each view in folder.Views
 ' if not view.isShortcut then
   ' view.code = view.name
  ' end if
' next
 ' go into the sub-packages
 Dim f ' running folder
 For Each f In folder.Packages
  if not f.IsShortcut then
   ProcessFolder f
  end if
 Next
end sub 

   [2]以下命令可以把名字加载备注中
'把pd中那么name想自动添加到comment里面
'如果comment为空,则填入name;如果不为空,则保留不变,这样可以避免已有的注释丢失.

Option Explicit 

ValidationMode = True

InteractiveMode = im_Batch 



Dim mdl ' the current model 



' get the current active model 

Set mdl = ActiveModel 

If (mdl Is Nothing) Then

MsgBox "There is no current Model "

ElseIf Not mdl.IsKindOf(PdPDM.cls_Model) Then

MsgBox "The current model is not an Physical Data model. "

Else

ProcessFolder mdl 

End If



' This routine copy name into comment for each table, each column and each view 

' of the current folder 

Private sub ProcessFolder(folder) 

Dim Tab 'running table 

for each Tab in folder.tables 

if not tab.isShortcut then 

if trim(tab.comment)="" then '如果有表的注释,则不改变它.如果没有表注释.则把name添加到注释里面. 

tab.comment = tab.name 

end if 

Dim col ' running column 

for each col in tab.columns 

if trim(col.comment)="" then '如果col的comment为空,则填入name,如果已有注释,则不添加;这样可以避免已有注释丢失.

col.comment= col.name 

end if 

next 

end if 

next 



Dim view 'running view 

for each view in folder.Views 

if not view.isShortcut and trim(view.comment)="" then 

view.comment = view.name 

end if 

next 



' go into the sub-packages 

Dim f ' running folder 

For Each f In folder.Packages 

if not f.IsShortcut then 

ProcessFolder f 

end if 

Next 

end sub
 * @author yjy
 *
 */
public class PDremark {

}
