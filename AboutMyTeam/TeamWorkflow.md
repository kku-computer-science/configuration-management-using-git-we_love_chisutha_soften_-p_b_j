# Team Collaboration Workflow
**Team Name:** we_love_chisutha_soften_(p_b_j)
**Semester:** 2/2568

##  Members
1. **Jularat** (Student ID: 663380378-4)
2. **Kittikorn** (Student ID: 663380587-5)
3. **Siwawit** (Student ID: 663380402-3)

---

##  File Structure

- `SortInterface.java`: (Interface Agreement) ข้อตกลงกลางของทีม
- `MainApp.java`: (Main Entry) หน้าต่างเมนูสำหรับเลือกใช้งาน
- `QuickSort.java`: (Implementation) โค้ดส่วน Sort
- `BubbleSort.java`: (Implementation) โค้ดส่วน Sort

ทำแยกไฟล์เพื่อป้องกัน Merge Conflict

---

## Workflow

เราแบ่งขั้นตอนการทำงานออกเป็น 3 ระยะ ดังนี้:

### Phase 1: Project Initialization
1. **Jularat** จะทำการสร้างโครงสร้างไฟล์เบื้องต้น (`MainApp.java`, `SortInterface.java`)
2. สร้าง Class เปล่า (Mock Class) สำหรับ `QuickSort.java` และ `BubbleSort.java` เพื่อให้โปรแกรม Compile ผ่าน
3. Merge ไฟล์ทั้งหมดขึ้นสู่ `main` branch บน GitHub Repository ทีม

### Phase 2: Parallel Development
1. สมาชิกทีมทุกคนทำการดึงโค้ดล่าสุดลงเครื่อง
2. สมาชิกสร้าง Branch ส่วนตัวตามกฎการตั้งชื่อ
3. **Kittikorn** รับผิดชอบแก้ไขไฟล์ `QuickSort.java`
4. **Siwawit** รับผิดชอบแก้ไขไฟล์ `BubbleSort.java`
5. สมาชิกทำการ `commit` และ `push` งานขึ้นสู่ Branch ของตนเองบน GitHub

### Phase 3: Integration & Testing
1. เมื่อสมาชิกเขียนโค้ดเสร็จสิ้น ให้แจ้ง
2. **Jularat** ทำหน้าที่ตรวจสอบและกด **Merge** Branch ของคนในทีมเข้าสู่ `main`
3. ทดสอบรันโปรแกรมครั้งสุดท้ายเพื่อยืนยันความถูกต้อง (Final Verification)

---

### AI ช่วยทำให้สวยดี
