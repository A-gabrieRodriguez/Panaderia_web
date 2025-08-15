import PhoneIcon from '../assets/phone-call.png';
import EmailIon from '../assets/email.png';
import WebIcon from '../assets/webicon.png';
import Logo from '../assets/Logo.png';
import FacebookIcon from '../assets/facebook.png';
import InstagramIcon from '../assets/instagram.png';
import TwitterIcon from '../assets/twitter.png';

const Footer = () => {
  return (
    <footer className="grid grid-cols-2 grid-rows-1 gap-3 bg-[#2D2D31] text-white py-10s">
      {/** First Column */}
      <div className="container flex flex-col items-start text-left shadow p-4 rounded-lg ml-20 mt-10 pl-20 py-10 text-2xl">
        <div className="flex flex-col gap-2 col-span-1 items-start text-left">
          <p> <img src={PhoneIcon} alt="Phone Icon" className="inline-block mr-2" /> (123) 456-7890</p>
          <p className='mt-5'><img src={EmailIon} alt="Email Icon" className="inline-block mr-2 " />Email: info@mybakery.com</p>
          <p className='mt-5'><img src={WebIcon} alt="Web Icon" className="inline-block mr-2 " />LafuenteBakery.com</p>
        </div>
      </div>
      {/* Second Column */}
      <div className="flex flex-col gap-2 col-span-1 shadow p-4 rounded-lg mx-10 pl-20 justify-center items-center ">
        <img src={Logo} alt="Logo" className="w-100 p-auto" />
        <div className='flex justify-between w-40'>
          <img src={FacebookIcon} alt="Facebook Icon" className="inline-block mr-2 w-10" />
          <img src={InstagramIcon} alt="Instagram Icon" className="inline-block mr-2 w-10" />
          <img src={TwitterIcon} alt="Twitter Icon" className="inline-block mr-2 w-10" />
        </div>
      </div>

    </footer>
  );
};

export default Footer;
