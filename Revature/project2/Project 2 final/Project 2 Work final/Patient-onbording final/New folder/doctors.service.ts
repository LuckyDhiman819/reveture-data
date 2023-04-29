import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DoctorsService {
  getDoctorsDetails(){
    return [
        {doctorName: "Dr. Tufail Ahmed", department: "Neurosciences/Neurosurgery, Minimal Access Surgery",
		qualification: "MS (General Surgery), DNB (General Surgery), FRCS (General Surgery), FRCS (Neurosurgery)", 
		expertise: "Brain Tumour Surgery, Minimal Invasive Spine Surgery, Trigeminal Neuralgia Surgery, Stereotactic Radio surgery, Paediatric Neurosurgery"},
        {doctorName: "Dr. Lucky Dhiman", department: "Bone & Joint/Orthopaedics, Minimal Access Surgery", qualification: "MS (Ortho), MRCS (UK), Fellow Spine & Scoliosis Surgery, USA", expertise: "Spine surgery, Minimally invasive spine surgery, Scoliosis surgery"},
        {doctorName: "Dr. Ketan Shinde", department: "Physical Medicine & Rehabilitation, Development Disorders", qualification: "MBBS, MD (Rehabilitation Medicine), DNB (Rehabilitation Medicine), Senior Residency", expertise: "Neuro Rehabilitation, Geriatric Rehabilitation, Musculoskelatal Rehabilitation, Cardiac Rehabilitation and Secondary Prevention Service, Pulmonary Rehabilitation, Pediatric Rehabilitation, Cancer Rehabilitation"},
        {doctorName: "Dr. Kafil Rehman", department: "Diabetes & Bariatric Surgery, Endocrinology & Diabetes", qualification: "Registered Dietician, CDE; BHSC(Dietetics); Post Graduation in Clinical Nutrition and Dietetics", expertise: "Carbohydrate Counting for people with Type 1 Diabetes , Gestational Diabetes Mellitus, Diabetes complications and cardiac diseases"},
        {doctorName: "Dr. Pooja Karri", department: "Children/Paediatrics, Diabetes & Bariatric Surgery, Endocrinology & Diabetes", qualification: "MBBS, MD, DNB(Paediatrics), Fellowship in Paediatric and Adolescent endocrinology", expertise: "Growth and Hormonal disorders in children including: Short stature, Juvenile diabetes, Childhood obesity, Disorders of puberty, Rickets, calcium and bone related disorders, Thyroid and adrenal disorders, Disorders of sexual differentiation"},   
        {doctorName: "Dr. Mulla Mohammad", department: "Cosmetology & Plastic Surgery, Plastic & Reconstructive Surgery", qualification: "MBBS, MS(General Surgery), MCh (Plastic Surgery)", expertise: "Breast reconstruction & cosmetic breast surgery, Body Contouring, Gynaecomastia, Reconstructive Microvascular surgery, Onco-reconstrcuction."}    
    ]
}
  constructor() { }
}
